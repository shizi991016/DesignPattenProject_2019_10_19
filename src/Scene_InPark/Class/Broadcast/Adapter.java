package Scene_InPark.Class.Broadcast;

import java.util.Scanner;

//该适配器更改广播播放闭园语言
public class Adapter implements Chinese, English, German{

    //要切换成的语言,默认为中文
    private String language = "A";

    //将原本的闭园语音转换为切换后的语音
    public String translate() {

        //通知使用者切换语言
        System.out.print("请选择您需要切换的语言：A、取消切换，默认中文，B、English，C、Deutsch\n" + //中文
                "Please select the language you need to switch：A、取消切换，默认中文，B、English，C、Deutsch\n" +//英文
                "Bitte wählen Sie die gewünschte Sprache aus：A、D、取消切换，默认中文，B、English，C、Deutsch");//德文

        Scanner sc = new Scanner(System.in);
        language = sc.next();

        //选择需要的语言翻译
        String message = null;

        if (language.equals("A")) {
            message = Chinese.chinese();//调用Chinese类的方法将语音设置为中文
        }
        else if (language.equals("B")) {
            message = English.english();//调用English类的方法将语音设置成英语
        }
        else if (language.equals("C")) {
            message = German.german();//调用German类的方法将语音设置为德语
        }
        else {
            System.out.println("字母输入错误，请重新输入");
            translate();
        }
        //返回切换好的语音
        return message;
    }
}
