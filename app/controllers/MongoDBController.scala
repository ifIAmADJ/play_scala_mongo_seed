package controllers

import cn.playscala.mongo.Mongo
import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.libs.json.{JsObject, Json}

@Singleton
class MongoDBController @Inject()(cc: ControllerComponents, mongo: Mongo) extends AbstractController(cc) {

  /**
    * You should config your 'mongodb.uri' in 'conf/application.conf' first!
    */
  def testMongo = Action{

    //try to insert "{"success":"0"}" into your mongoDB's collection.
    val testValue : JsObject = Json.obj("success"->0)

    //replace "test" with your own mongoDB's collection, or it will create a new collection named "test".
    mongo.collection("test").insertOne(testValue)

    Ok(views.html.result("Check whether this testValue has added to your collection successfully."))
  }

}
