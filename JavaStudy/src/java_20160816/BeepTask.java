package java_20160816;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	
	public void run(){
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			
			toolkit.beep();
			
			try{

				Thread.sleep(500);
				
			}catch(Exception e){}
			
		} // for end
		
	} // run() end
	
}
