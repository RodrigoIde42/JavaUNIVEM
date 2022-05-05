package aula10;

public class ControleRemoto {
    
    private Televisao televisao;
    public ControleRemoto()
    {
        this.televisao = new Televisao();
    }
    public void addVolume()
    {
        this.televisao.sobevolume();
    }
    public void subVolume()
    {
        this.televisao.descevolume();
    }
    public void setVolume(int volume)
    {
        this.televisao.setvolume(volume);
    }
    public int getVolume()
    {
        return this.televisao.getvolume();
    }
    public void exibevolume()
    {
        System.out.println("Volume: "+ getVolume());
    }
    public void addCanal()
    {
        this.televisao.sobecanal();
    }
    public void subCanal()
    {
        this.televisao.descecanal();
    }
    public void setCanal(int canal)
    {
        this.televisao.setcanal(canal);
    }
    public int getCanal()
    {
        return this.televisao.getcanal();
    }
    public void exibecanal()
    {
        System.out.println("Canal: "+ getCanal());
    }


}
