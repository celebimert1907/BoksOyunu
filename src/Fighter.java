import org.jetbrains.annotations.NotNull;

public class Fighter {

    String name;
    int health;
    int damage;
    int weight;
    double dodge;

    Fighter (String name, int health, int damage, int weight, double dodge) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        if(dodge>=0 && dodge<=100){
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit ( Fighter foe) {


        System.out.println(this.name + "\t" + foe.name + "e\t:\t" + this.damage + "\tHasar verdi");

        if (foe.isDodge()) {
            System.out.println(foe.name + "\tGelen hasari savurdu!!!");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }
    boolean isDodge(){

        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}



