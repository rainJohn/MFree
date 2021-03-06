package com.xiefei.openmusicplayer.ui.local.SongLibrary.songs;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.xiefei.library.XRecyclerAdapter;
import com.xiefei.library.XViewHolderHelper;
import com.xiefei.openmusicplayer.R;
import com.xiefei.openmusicplayer.entity.SongInfo;
import com.xiefei.openmusicplayer.utils.OpenMusicPlayerUtils;


/**
 * Created by xiefei on 16/7/10.
 */
public class SongListAdapter extends XRecyclerAdapter<SongInfo> {

    private static final String Tag = "SongListAdapter";

    public SongListAdapter(Context context, @LayoutRes int layoutId) {
        super(context, layoutId);
    }

    @Override
    public void bindItemView(XViewHolderHelper holderHelper, SongInfo data, int position) {
        ((TextView)holderHelper.getViewById(R.id.primary_title)).setText(data.getTitle());
        ((TextView)holderHelper.getViewById(R.id.secondary_title)).setText(data.getArtist());
        Log.d(Tag,OpenMusicPlayerUtils.getAlbumArtUri(data.getAlbumId()));
        Glide.with(context.getApplicationContext()).load(OpenMusicPlayerUtils.getAlbumArtUri(data.getAlbumId())).placeholder(R.drawable.logo_icon).into((ImageView) holderHelper.getViewById(R.id.image));
    }
}
