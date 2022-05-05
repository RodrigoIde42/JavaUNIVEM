package aula10;

public class Televisao {
    
    int volume;
    int canal;

    public Televisao(){
        this.setcanal(0);
        this.setvolume(0);
    }

    public Televisao(int canal, int volume)
    {
        setcanal(canal);
        setvolume(volume);
    }
    
    public void setvolume(int volume){
        if((volume < 1) || (volume > 100)){
             this.volume = 1;
        }
        else{
            this.volume = volume;
        }
    }

    public int getvolume()
    {
        return this.volume;
    }

    public void setcanal(int canal){
        if((canal < 1) || (canal > 50)){
             this.canal = 1;
        }
        else{
            this.canal = canal;
        }
    }

    public int getcanal()
    {
        return this.canal;
    }

    public void sobevolume()
    {
        setvolume(getvolume() + 1);
    }

    public void descevolume()
    {
        setvolume(getvolume() - 1);
    }

    public void sobecanal()
    {
        setcanal(getcanal() + 1);
    }

    public void descecanal()
    {
        setcanal(getcanal() - 1);
    }
    

}
