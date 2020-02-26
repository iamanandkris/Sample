import org.scalatest.{EitherValues, Inside, Inspectors, OptionValues}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatest.matchers.should.Matchers

class WorkSpec extends AnyFlatSpecLike
  with Matchers with OptionValues with
  EitherValues with
  Inside with Inspectors with ScalaFutures {

  "TCName" must s"condition" in {

    123 shouldBe 123
  }
}
