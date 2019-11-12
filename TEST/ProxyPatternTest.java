package GroupMoviePhotoScene;

import GroupMoviePhotoScene.GeneratePhotoElement.*;
import GroupMoviePhotoScene.GeneratePhotoElement.ArPhotoRoom.*;
import GroupMoviePhotoScene.GeneratePhotoElement.Photo.*;
import GroupMoviePhotoScene.GeneratePhotoElement.PhotoUser.User;

public class ProxyPatternTest {
    public static void ProxyPatternTest(){
        ProxyPhotoRoom room = new ProxyPhotoRoom();
        User user = new User();
        user.request(room);
        user.request(room);
        user.request(room);
    }
}
