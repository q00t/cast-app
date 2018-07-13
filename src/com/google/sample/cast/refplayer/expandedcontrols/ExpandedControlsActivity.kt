package com.google.sample.cast.refplayer.expandedcontrols

import com.google.android.gms.cast.framework.CastButtonFactory
import android.view.Menu
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity
import com.google.sample.cast.refplayer.R


class ExpandedControlsActivity : ExpandedControllerActivity() {

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.expanded_controller, menu)
        CastButtonFactory.setUpMediaRouteButton(this, menu,
            R.id.media_route_menu_item
        )
        return true
    }

}