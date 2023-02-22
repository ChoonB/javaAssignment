package day4;

public class Exercise7_4 {
    public static void main(String args[]) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}
//예상결과) CH:10 VOL:20

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // (구현)
    MyTv(){             //기본 생성자
        isPowerOn = true;
        channel = 0;
        volume = 0;
    }

    public void setChannel(int chaNum){
        if(chaNum <= MAX_CHANNEL || chaNum >= MIN_CHANNEL){
            channel = chaNum;
        }else if(chaNum>MAX_CHANNEL){
            channel = MAX_CHANNEL;
        } else {
            channel = MIN_CHANNEL;
        }
    }

    public int getChannel(){
        return channel;
    }

    public void setVolume(int volNum){
        if(volNum<= MAX_VOLUME || volNum>= MIN_VOLUME){
            volume = volNum;
        } else if (volNum>MAX_VOLUME) {
            volume = MAX_VOLUME;
        }else {
            volume = MIN_VOLUME;
        }
    }

    public int getVolume(){
        return  volume;
    }

}

