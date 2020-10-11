package base;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class mySet {

        LinkedHashSet<Integer> myHashSet = new LinkedHashSet<Integer>();


        public LinkedHashSet<Integer> mySet(){
                return this.myHashSet;
        }

        public void add(int number){
                if(number < 0){number = number * -1;}
                if(myHashSet.isEmpty()){
                        myHashSet.add(number);
                }
                Iterator<Integer> iterator = this.myHashSet.iterator();
                while (iterator.hasNext()){
                        if(bit(number) == bit(iterator.next())) {
                         return;
                        }
                }
                myHashSet.add(number);
        }

        private int bit(int number){
                int count = 0;
                while (number != 0) {
                        count++;
                        number = number & (number - 1);
                }
                return count;
        }

        public int get(int index){
                Iterator<Integer> setIterator = myHashSet.iterator();
                int i = 0;
                while(setIterator.hasNext()) {
                        setIterator.next();
                        i++;
                        if(i == index) {
                                return setIterator.next();
                        }
                }
                return 0;
        }

        public void print(){
                Iterator<Integer> setIterator = myHashSet.iterator();
                while(setIterator.hasNext()) {
                        System.out.print(setIterator.next() + " ");
                }
                System.out.println();
        }

        @Override
        public String toString(){
                return this.myHashSet.toString();
        }
}