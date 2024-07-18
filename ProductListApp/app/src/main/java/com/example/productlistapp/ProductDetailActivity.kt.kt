import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>("product")

        if (product != null) {
            findViewById<TextView>(R.id.productNameDetail).text = product.name
            findViewById<TextView>(R.id.productDescriptionDetail).text = product.description
            findViewById<TextView>(R.id.productPriceDetail).text = "${product.price}"
        }
    }
}
