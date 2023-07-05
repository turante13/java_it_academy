package homework.hw_13_04;

public interface IPlayable {
    public void play();
    public void pause();
    public void stop();
}

class AudioPlayer implements IPlayable{
    @Override
    public void play(){
        System.out.println("audio PLAY");
    }

    @Override
    public void pause(){
        System.out.println("audio PAUSE");
    }

    @Override
    public void stop(){
        System.out.println("audio STOP");
    }
}

class VideoPlayer implements IPlayable{
    @Override
    public void play(){
        System.out.println("video PLAY");
    }

    @Override
    public void pause(){
        System.out.println("video PAUSE");
    }

    @Override
    public void stop(){
        System.out.println("video STOP");
    }
}

class Buddha{
    public static void main(String[] args) {
        AudioPlayer audio = new AudioPlayer();
        VideoPlayer video = new VideoPlayer();
        audio.play();
        audio.stop();
        video.play();
        video.pause();
        video.stop();
    }
}
