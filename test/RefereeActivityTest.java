import android.R;
import android.widget.TextView;
import com.odde.tennis.Referee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class RefereeActivityTest {
    @Test
    public void display_score(){
        Referee referee = new Referee();
        referee.onCreate(null);
//        TextView scoreView = (TextView) referee.findViewById(R.id.);
//        assertEquals("Love All", scoreView.getText().toString());
    }
}
