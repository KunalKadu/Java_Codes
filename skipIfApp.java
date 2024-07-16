//this is similar to skip substring from string 
//but in this we are taking atring app and apple if only "app " is present then skip
// if contain " apple " then dont skip


public class skipIfApp {
public static void main(String[] args) {
    System.out.println(skipNotApple("bappadah"));
    System.out.println(skipNotApple("bappleah"));
}
static String skipNotApple(String up){
    if(up.isEmpty()){
        return " ";
    }
    if(up.startsWith("app") && !up.startsWith("apple")){
        return skipNotApple(up.substring(3));// 3 is length of app
    }else{
        return up.charAt(0)+skipNotApple(up.substring(1));
    }
}
}
