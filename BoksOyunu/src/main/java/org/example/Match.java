package org.example;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=========== YENİ ROUND  ============= ");
                this.f2.health = this.f1.hit(f2); //f1 in hit metodunu rakibe atadım.
                // ilk vuran f1 olarak ayarladım.
                // f2 nin sağlığı f1 in hit metodundan dönen değer olcak.

                if (isWin())
                {
                    break;
                }

                this.f1.health = this.f2.hit(f1); // 2. dövüşçü 1 e vuruyor.
                if (isWin())
                {
                    break;
                }

                System.out.println(this.f1.name + " Sağlık--> " + this.f1.health );
                System.out.println(this.f2.name + " Sağlık--> " + this.f2.health+ "\n\n");

            }
        }
        else
        {
            System.out.println("SPORSULARIN SİKLETLERİ UYMUYOR YARIŞILAMAZZ...");
        }


    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " KAZANDIII...");
            return true;
        }

        if (this.f2.health==0)
        {
            System.out.println(this.f1.name + " KAZANDII....");
            return true;
        }
        return false;
    }
}
