package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.Tourist;

public class FlyWeightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tourist tom = new Tourist("Tom");
		tom.goToFacilitie("coast");
		tom.goToFacilitie("wheel");
		tom.goToFacilitie("coast");
	}

}