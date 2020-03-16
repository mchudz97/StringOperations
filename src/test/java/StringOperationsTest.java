import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringOperationsTest {

    private static StringOperations temp;

    @BeforeAll
    private static void setUp(){
        temp = new StringOperations();
    }

    @ParameterizedTest(name = "{index} returns {1} if input text is {0}")
    @DisplayName("Checking first condition of palidrome (only true)")
    @CsvSource({"1,  TRUE",
            "a, TRUE",
            "X, TRUE",
            "*, TRUE"})
    void isPalidromeFirstCondition1(String val, String isPalidrome) {

        Assertions.assertEquals(Boolean.parseBoolean(isPalidrome), temp.isPalindrome(val) );

    }

    @ParameterizedTest(name = "{index} returns {1} if input text is {0}")
    @DisplayName("Checking second condition of palidrome (only false)")
    @CsvSource({"Aba,  FALSE",
            "ZzzzzzW, FALSE",
            "kordjanglupeg, FALSE",
            "KoronaDobrePiwo, FALSE",
            "123456543 21, FALSE"})
    void isPalidromeSecoundCondition2(String val, String isPalidrome) {

        Assertions.assertEquals(Boolean.parseBoolean(isPalidrome), temp.isPalindrome(val) );

    }

    @ParameterizedTest(name = "{index}  {0} connected with {1}")
    @DisplayName("Checking concat")
    @CsvSource({"dzien dobry,  cos sie popsulo, dzien dobrycos sie popsulo",
            "kjedy b iest njc,, kjedy b iest njc",
            "997, )(*&^, 997)(*&^",
            "FeR, JEEEE, FeRJEEEE"})
    void concatTest1(String val1, String val2, String result) {

        Assertions.assertEquals(result, temp.concat(val1, val2) );

    }

    @ParameterizedTest(name = "{index} returns {1} when input is {0}")
    @DisplayName("Checking reverse ")
    @CsvSource({"xD, Dx",
            "B3K4, 4K3B",
            "tokleb ynwosneszeb, bezsensowny belkot ",
            "BONUSBONUSBONUS, SUNOBSUNOBSUNOB"})
    void reverseTest(String input, String result) {

        Assertions.assertEquals(result, temp.reverse(input) );

    }

}