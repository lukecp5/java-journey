package volleyball;

class Player {
    private String name;
    private double atkScore;
    private double blkScore;

    public Player(String name, double atk, double blk) {
        this.name = name;
        this.atkScore = atk;
        this.blkScore = blk;
    }

    public String getName() {
        return name;
    }

    public double getAttackScore() {
        return atkScore;
    }

    public double getBlockScore() {
        return blkScore;
    }

    public void setAttackScore(double atk) {
        atkScore = atk;
    }

    public void setBlockScore(double blk) {
        blkScore = blk;
    }

    public void printInfo() {
        System.out.printf("%s (attack = %f, block = %f)\n", name, atkScore, blkScore);
    }
}