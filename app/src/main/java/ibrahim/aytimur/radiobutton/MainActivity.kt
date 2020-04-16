package ibrahim.aytimur.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RadioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (R.id.rbKadin==checkedId)
                textView2.text= rbKadin.text.toString()
            if (R.id.rbErkek==checkedId)
                textView2.text= rbErkek.text.toString()
        }
    }
}
