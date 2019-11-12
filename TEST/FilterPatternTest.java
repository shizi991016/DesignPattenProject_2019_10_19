package Test;

import FacilityFilter.FilterPattern.*;
import FacilityFilter.ObserverPattern.Edit.*;
import FacilityFilter.ObserverPattern.Listener.*;
import FacilityFilter.ObserverPattern.Publisher.*;

import java.util.ArrayList;
import java.util.List;
/*
 * 过滤器模式API1测试
 */
public class FilterPatternTest {
    public static void main(String []args){
        Editor editor = new Editor();
        Criteria adultCri= new CriteriaAdult();
        Criteria normalHeightCri=new CriteriaNormalHeight();
        Criteria harderHeightCri=new CriteriaHarderHeight();
        Criteria RollerCoster = new RollerCosterCriteria(adultCri,harderHeightCri);
        Criteria Carrousel = new CarrouselCriteria(adultCri,normalHeightCri);
        List<EventListener> RollerPlayer=new ArrayList<>();
        List<EventListener> CarrouselPlayer=new ArrayList<>();

        RollerCosterListener R1=new RollerCosterListener("a1",17,190);
        RollerCosterListener R2=new RollerCosterListener("a2",26,190);
        RollerCosterListener R3=new RollerCosterListener("a3",6,20);
        RollerCosterListener R4=new RollerCosterListener("a4",75,30);

        CarrouselListener R5=new CarrouselListener("a5",2,150);
        CarrouselListener R6=new CarrouselListener("a6",76,160);

        //每个Listener订阅预约游乐设施
        editor.events.subscribe("RollerCoster",R1);
        RollerPlayer.add(R1);
        editor.events.subscribe("RollerCoster",R2);
        RollerPlayer.add(R2);
        editor.events.subscribe("RollerCoster",R3);
        RollerPlayer.add(R3);
        editor.events.subscribe("RollerCoster",R4);
        RollerPlayer.add(R4);
        editor.events.subscribe("Carrousel",R5);
        CarrouselPlayer.add(R5);
        editor.events.subscribe("Carrousel",R6);
        CarrouselPlayer.add(R6);

        //摩天轮筛选所有订阅者
        System.out.println("RollerCosterVisitors:");
        printVisitors(RollerCoster.meetCriteria(RollerPlayer));

        //旋转木马筛选所有订阅者
        System.out.println("CarrouselVisitors:");
        printVisitors(Carrousel.meetCriteria(CarrouselPlayer));
    }

    static void printVisitors(List<EventListener> visitors){

        for(EventListener visitor:visitors)
        {
            System.out.println("name:"+visitor.getName()+" age:"+visitor.getAge()+" height:"+visitor.getHeight());
        }
        System.out.println("");
    }
}
