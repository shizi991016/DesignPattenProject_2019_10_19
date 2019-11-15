package TEST;


import GroupMoviePhotoScene.GeneratePhotoElement.*;
import GroupMoviePhotoScene.GeneratePhotoElement.ArPhotoRoom.*;
import GroupMoviePhotoScene.GeneratePhotoElement.Photo.*;
import GroupMoviePhotoScene.GeneratePhotoElement.PhotoUser.User;

public class BridgePatternTest {
    public static void main(String[] args){

        ProxyPhotoRoom test_room = new ProxyPhotoRoom();
        User test_usr = new User();
        test_usr.request(test_room);

        MickeyPhoto testPhoto1 = new MickeyPhoto("MickeyMouse","photo with mickey!!!");
        String testCharacterName = testPhoto1.getPhotoScene().getMainCharacter().getCharacterName();
        String testBackground = testPhoto1.getBackground();
        String testLogo = testPhoto1.getLogo();

        testPhoto1.getPhotoScene().getMainCharacter().sayHi();
        testPhoto1.getPhotoScene().getMainCharacter().hug();
        testPhoto1.getPhotoScene().getMainCharacter().pose();



    }
}
