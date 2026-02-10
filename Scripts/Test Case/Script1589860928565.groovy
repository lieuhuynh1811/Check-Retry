import com.kms.katalon.core.util.KeywordUtil
import java.util.*
println counter
if(counter.toInteger() == 3 && Random.nextBoolean()) {
	KeywordUtil.markFailed("Failed");
}