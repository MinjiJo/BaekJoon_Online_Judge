select c.*
from (select rownum r, b.* 
		from (select *
				from (select * from show1_post
						union
						select * from show2_post where openLevel < 3
						union
						select * from show3_post where openLevel < 3
						union 
						select * from show4_post
						where hashtag like '%#여기여기%' and openLevel = 1
						union 
						select * from show2_post
						where hashtag like '%#여기여기%' and openLevel = 1
						) a
				order by a.posted_time
			) b
		) c
where c.r < 12;

select *
from show4_post
where hashtag like '%#여기여기%' and openLevel = 1;


select c.*
from (select rownum r, b.*
		from (select *
				from show1_post, show2_post
				order by posted_time desc) b
		) c
where c.r<20;
	
select ROW_NUMBER() OVER(ORDER BY show2_post.posted_time), *
from show2_post
order by posted_time;