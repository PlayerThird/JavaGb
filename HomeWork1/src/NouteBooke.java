import java.awt.*;

public class NouteBooke {
    int id;
    String OS;
    String color;
    String ozu;
    int volume;
    @Override
    public String toString() {
        return String.format("id:%d OS:%s Цвет:%s ОЗУ:%s Объём:%d", id, OS,color,ozu,volume);
    }


    public boolean equalOS(String o) {
        return OS == o;
    }
    public boolean equalColor(String o) {
        return color == o;
    }
    public boolean equalOzu(String o) {
        return ozu == o;
    }
    public boolean equalVolume(Integer o) {
        return volume == o;
    }
    public String Volume() {

        return String.format(" *** %d *** ",volume);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
