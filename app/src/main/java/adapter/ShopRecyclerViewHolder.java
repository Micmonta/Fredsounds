package adapter;

/**
 * Created by micmo on 17/03/02.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import micmon.fredsounds.R;

public class ShopRecyclerViewHolder extends RecyclerView.ViewHolder {
    public ImageView produceImage;
    public TextView productName;
    public ShopRecyclerViewHolder(View itemView) {
        super(itemView);
        produceImage =(ImageView)itemView.findViewById(R.id.product_image);
        productName = (TextView)itemView.findViewById(R.id.product_name);
    }
}