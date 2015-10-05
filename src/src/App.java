package src;

class App{
    int sumOdd(int n){
        
        int result = 0;
        
        for(int i=0; i<n; i++){
            if(n % 2 == 1){
                result = result + n;
            }
        }
        return result;
    }
    
    int total(int [] a){
        int result = 0;
        for(int i=0; i<a.length; i++){
            result = result + a[i];
        }
        return result;
    }
    
    double average(int [] a){
        double result = 0;
        for(int i=0; i<a.length; i++){
            result = result + a[i];
        }
        result = result / a.length;
        return result;
    }
    
    int [] divider(int n){
        int [] tmp = new int[n];
        int index = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                tmp[index] = i;
                index++;
            }
        }
        int [] result = new int[index];
        System.arraycopy(tmp, 0, result, 0, index);
        return result;
    }
    
    boolean searchFile(String fileName, String folderName){        
        String [] list = new java.io.File(folderName).list();
        for (String list1 : list) {
            if (fileName.equals(list1)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String [] args){
        int sum = new App().sumOdd(20);
        System.out.print("summation of 20 = ");
        System.out.println(sum);
        
        int [] a = {2, 3, 5, 6};
        int tol = new App().total(a);
        System.out.print("summation array = ");
        System.out.println(tol);        
    
        double aver = new App().average(a);
        System.out.print("average = ");
        System.out.println(aver);  
        
        int [] tmp = new App().divider(20);
        for(int i=0; i<tmp.length; i++){
            if(i==(tmp.length-1))System.out.println(tmp[i]);
            else System.out.print(tmp[i]+", ");                       
        }
              
        boolean s = new App().searchFile("a", "/");
        System.out.println(s);
    }

   
}