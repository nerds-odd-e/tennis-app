import android.widget.TextView;
import com.odde.tennis.R;
import com.odde.tennis.Referee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class RefereeActivityTest {
    @Test
    public void display_score(){
        Referee referee = Robolectric.buildActivity(Referee.class).create().get();
        TextView scoreView = (TextView) referee.findViewById(R.id.scoreView);
        assertEquals("Love All", scoreView.getText().toString());
    }
}
