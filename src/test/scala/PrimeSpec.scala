import com.example.PrimeFactors
import org.scalatest._

class PrimeSpec extends FlatSpec with Matchers {
  "Prime Factors" must "be List() for 1" in {
    PrimeFactors.result(1) should equal(List[Int]())
  }

//  it must "be List(2) for 2" in {
//    PrimeFactors.result(2) should equal(List(2))
//  }
//
//  it must "be List(3) for 3" in {
//    PrimeFactors.result(3) should equal(List(3))
//  }
//
//  it must "be List(2, 2) for 4" in {
//    PrimeFactors.result(4) should equal(List(2, 2))
//  }
//
//  it must "be List(5) for 5" in {
//    PrimeFactors.result(5) should equal(List(5))
//  }
//
//  it must "be List(2, 3) for 6" in {
//    PrimeFactors.result(6) should equal(List(2, 3))
//  }
//
//  it must "be List(7) for 7" in {
//    PrimeFactors.result(7) should equal(List(7))
//  }
//
//  it must "be List(2, 2, 2) for 8" in {
//    PrimeFactors.result(8) should equal(List(2, 2, 2))
//  }
//
//  it must "be List(3, 3) for 9" in {
//    PrimeFactors.result(9) should equal(List(3, 3))
//  }
//
//  it must "be List(3, 23) for 69" in {
//    PrimeFactors.result(69) should equal(List(3, 23))
//  }
//
//  it must "be List(2, 3, 29) for 174" in {
//    PrimeFactors.result(174) should equal(List(2, 3, 29))
//  }

}
