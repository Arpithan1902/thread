package com.classes;
class Mobile {

    void takePic() {
       System.out.println("capture pic ..");
    }

    void takePic(String mode) {
      System.out.println("capture pic with "+mode);
    }

  }
public class OverloadingDemo {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.takePic();
		mobile.takePic("panoroama");

	}

}
