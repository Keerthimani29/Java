
public class Demo{
    public static void main(String[] args){
       
        float unit=150;
        float result=0;
        if(unit> 0 && unit<100){
            result=0;
        }
        else if(unit > 101 && unit < 200){
            result=(float)(unit*0.8f);
        }
        else if(unit > 201 && unit < 300){
            result=(float)(unit*1.5f);
        }
        else{
            result=(float)(unit*3f);
        }

        System.out.println(result);
    }
}