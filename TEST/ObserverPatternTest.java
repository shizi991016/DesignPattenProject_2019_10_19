package FacilityFilter;

import FacilityFilter.ObserverPattern.Edit.Editor;
import FacilityFilter.ObserverPattern.Listener.CarrouselListener;
import FacilityFilter.ObserverPattern.Listener.RollerCosterListener;



public class ObserverPatternTest {
        public static void main(String []args){
            Editor editor = new Editor();

            RollerCosterListener R1=new RollerCosterListener("Jack",12,150);
            RollerCosterListener R2=new RollerCosterListener("Mike",66,160);
            RollerCosterListener R3=new RollerCosterListener("Kimmy",6,85);
            RollerCosterListener R4=new RollerCosterListener("Harvey",75,170);

            CarrouselListener R5=new CarrouselListener("Jack",12,150);
            CarrouselListener R6=new CarrouselListener("Mike",66,160);
            CarrouselListener R7=new CarrouselListener("Kimmy",6,85);
            CarrouselListener R8=new CarrouselListener("Harvey",75,170);

            //每个Listener订阅预约游乐设施
            editor.events.subscribe("RollerCoster",R1);
            editor.events.subscribe("RollerCoster",R2);
            editor.events.subscribe("RollerCoster",R3);
            editor.events.subscribe("RollerCoster",R4);
            editor.events.unsubscribe("RollerCoster",R1);
            editor.events.subscribe("Carrousel",R5);
            editor.events.subscribe("Carrousel",R6);
            editor.events.subscribe("Carrousel",R7);
            editor.events.subscribe("Carrousel",R8);

            editor.openRollerCoster();
            System.out.println("");
            editor.openCarrousel();
            System.out.println("");


        }

}
