package com.globo.clappr.components

import com.globo.clappr.base.UIObject

open class Container: UIObject {
    constructor(options: Map<String, Any>?) : super() {
    }

    var playback: Playback? = null
}
