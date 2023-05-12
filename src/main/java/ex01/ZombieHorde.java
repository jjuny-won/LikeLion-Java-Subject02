package ex01;

import java.util.ArrayList;

public class ZombieHorde {
    private ArrayList<Zombie> myZombies;
    private int size = 0;
    public ZombieHorde(int size) {
        myZombies = new ArrayList<>();
        for (int i=0; i<size; ++i) {
            myZombies.add(new Zombie());
        }
        this.size = size;
    }

    public void bite() {
        int beforeSize = size;
        for (int i=0; i<beforeSize; ++i) {
            Zombie newZombie = myZombies.get(i).bite();
            myZombies.add(newZombie);
            ++size;
        }
    }

    public static void main(String[] args) {
        System.out.println("일반 좀비 생성");
        Zombie zombie = new Zombie();
        System.out.println("\n새로운 좀비 변수 선언");
        Zombie newZombie;
        System.out.println("\n크기 10인 좀비 군단 생성");
        ZombieHorde zombieHorde = new ZombieHorde(10);
        System.out.println("\n기존 좀비가 물어서 새로운 좀비 생성");
        newZombie = zombie.bite();
        System.out.println("\n좀비 군단 테스트1");
        zombieHorde.bite();
        System.out.println("\n좀비 군단 테스트2");
        zombieHorde.bite();
    }
}
