package org.angularjs.cli

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class Blueprint {

  @SerializedName("name")
  @Expose
  var name: String? = null
  @SerializedName("description")
  @Expose
  var description: String? = null
  @SerializedName("options")
  @Expose
  var options: List<Option> = ArrayList()
  @SerializedName("arguments")
  @Expose
  var arguments: List<Option> = ArrayList()
  @SerializedName("error")
  @Expose
  var error: String? = null
  constructor()

  constructor(name: String, description: String?, options: List<Option>, arguments: List<Option>) {
    this.name = name
    this.description = description
    this.options = options
    this.arguments = arguments
  }

  override fun toString(): String {
    return name!!
  }
}

class Option {

  @SerializedName("name")
  @Expose
  var name: String? = null
  @SerializedName("default")
  @Expose
  var default: Any? = null
  @SerializedName("description")
  @Expose
  var description: String? = null
  @SerializedName("type")
  @Expose
  var type: String? = null
  @SerializedName("required")
  @Expose
  var isRequired: Boolean = false
  @SerializedName("visible")
  @Expose
  var isVisible: Boolean = false
  @SerializedName("enum")
  @Expose
  var enum: List<String> = ArrayList()
  @SerializedName("format")
  @Expose
  var format: String? = null

  constructor()

  constructor(name: String) {
    this.name = name
  }

  override fun toString(): String {
    return name!!
  }
}

