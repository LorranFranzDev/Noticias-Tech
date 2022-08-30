package dev.franz.noticiastech


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dev.franz.noticiastech.models.infoTech
import kotlinx.android.synthetic.main.res_item_infotech.view.*

class infoTechAdapter(private val onItemClicked: (infoTech) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<infoTech> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return infoTechViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_infotech, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {

            is infoTechViewHolder -> {
                holder.bind(items[position], onItemClicked)
            }
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(infoTech: List<infoTech>) {

        this.items = infoTech

    }

    class infoTechViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val infoTechTitle = itemView.title
        private val infoTechAuthor = itemView.author
        private val infoTechThumbnail = itemView.thumbnail

        fun bind(infoTech: infoTech, onItemClicked: (infoTech) -> Unit) {

            infoTechTitle.text = infoTech.title
            infoTechAuthor.text = infoTech.author

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(infoTech.thumbnailUrl)
                .into(infoTechThumbnail)

            itemView.setOnClickListener{
                onItemClicked(infoTech)
            }

        }
    }

}