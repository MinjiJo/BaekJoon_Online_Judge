$(function(){
	$('.moreIcon').click(function(){
		$(this).next().slideToggle(200);
	})
	
	$('#btnexit').click(function(){
		$('#detail_view').hide();
		$('#mask').hide();
	})
})