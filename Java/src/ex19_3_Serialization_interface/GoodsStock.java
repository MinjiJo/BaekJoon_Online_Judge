//����ȭ ���� Ŭ������ ����� �� 
// - implements java.io.Serializable ���� Ŭ����-����ȭ �ȵ�
//���� ���� : ObjectOutputExample2.java -> ObjectInputExample2.java
package ex19_3_Serialization_interface;

public class GoodsStock implements java.io.Serializable {
	String code;       
    int num;           
    GoodsStock(String code, int num) {   
        this.code = code;
        this.num = num;
    }
    void addStock(int num) {  
        this.num += num;              
    }
    int subtractStock(int num) throws Exception {  
        if (this.num < num)
            throw new Exception("����� �����մϴ�.");
        this.num -= num;            
        return num;
    }
}