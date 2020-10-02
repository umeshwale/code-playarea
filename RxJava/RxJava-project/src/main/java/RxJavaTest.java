import io.reactivex.Flowable;
import io.reactivex.Observable;


public class RxJavaTest {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.subscribe(System.out::println);
      
    }
}
