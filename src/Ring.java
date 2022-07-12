public class Ring {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (checkWeight()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("===YENI RAUND===");
                this.f2.health = this.f1.hit(this.f2);

                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + "\tSaglik\t:\t" + this.f1.health);
                System.out.println(this.f2.name + "\tSaglik\t:\t" + this.f2.health);

            }
        } else {
            System.out.println("Sporcularin agirliklari uyusmuyor!!!");
        }
    }
    boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin() {
        if (this.f2.health == 0) {
            System.out.println("Maci kazanan:\t" + this.f1.name);
            return true;
        }
        if (this.f1.health == 0) {
            System.out.println("Maci kazanan\t:\t" + this.f2.name);
            return true;
        }
        return false;
    }
}


