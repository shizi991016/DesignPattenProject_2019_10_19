package BlindHelpScene;

import BlindHelpScene.AdapterAndTemplateMethod.GuestWithDisabilities;
import BlindHelpScene.AdapterAndTemplateMethod.TalkingGuide;
import BlindHelpScene.AdapterAndTemplateMethod.VisualGuide;
import BlindHelpScene.AdapterAndTemplateMethod.VisualGuideAdapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        System.out.println("------------AdapterPatternTest------------");

        TalkingGuide talkingGuide = new TalkingGuide();
        VisualGuide visualGuide = new VisualGuide();

        System.out.println("1. A blind read a talking guide");
        GuestWithDisabilities guestWithDisabilities = new GuestWithDisabilities(talkingGuide);
        guestWithDisabilities.readGuide();

        System.out.println("2. A blind read a visual guide");
        guestWithDisabilities.setGuide(visualGuide);
        guestWithDisabilities.readGuide();

        System.out.println("3. A blind read a visual guide with the help of an adapter");
        VisualGuideAdapter visualGuideAdapter = new VisualGuideAdapter(visualGuide);
        guestWithDisabilities.setGuide(visualGuideAdapter);
        guestWithDisabilities.readGuide();
    }
}
