package lt.akl.pushups

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_send_data.setOnClickListener {
//            val friendlyMessage = FriendlyMessage(mMessageEditText.getText().toString(),
//                    mUsername,
//                    mPhotoUrl,
//                    null /* no image */)
//            mFirebaseDatabaseReference.child(MESSAGES_CHILD)
//                    .push().setValue(friendlyMessage)
        }
    }

    fun loadDatabase(firebaseData: DatabaseReference) {
//        val availableSalads: List<Salad> = mutableListOf(
//                Salad("Gherkin", "Fresh and delicious"),
//                Salad("Lettuce", "Easy to prepare"),
//                Salad("Tomato", "Boring but healthy"),
//                Salad("Zucchini", "Healthy and gross")
//        )
//        availableSalads.forEach {
//            val key = firebaseData.child("salads").push().key
//            it.uuid = key
//            firebaseData.child("salads").child(key).setValue(it)
//        }
    }
}
