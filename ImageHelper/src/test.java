import java.io.IOException;


public class test {
	 
    /**
     * test test
     * @param args
     */
    public static void main(String []args){
    	
    	try {
			ImageHelper.cutImage("d:\\1.jpg", "d:\\2.jpg", 100, 100, 100, 100);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
}
