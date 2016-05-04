package info.mukel.telegram.bots.v2.methods

import info.mukel.telegram.bots.v2.api.ApiRequest
import info.mukel.telegram.bots.v2.methods.ParseMode.ParseMode
import info.mukel.telegram.bots.v2.model.{Message, ReplyMarkup}

/** editMessageCaption
  *
  * Use this method to edit captions of messages sent by the bot or via the bot (for inline bots).
  * On success, if edited message is sent by the bot, the edited Message is returned, otherwise True is returned.
  *
  * @param chatId           Integer or String	No	Required if inline_message_id is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
  * @param messageId        Integer	No	Required if inline_message_id is not specified. Unique identifier of the sent message
  * @param inlineMessageId  String	No	Required if chat_id and message_id are not specified. Identifier of the inline message
  * @param caption          String	Optional	New caption of the message
  * @param replyMarkup      InlineKeyboardMarkup	Optional	A JSON-serialized object for an inline keyboard.
  */
case class EditMessageCaption(
                               chatId                : Option[Either[Long, String]] = None,
                               messageId             : Option[Long] = None,
                               inlineMessageId       : Option[Long] = None,
                               caption               : Option[String] = None,
                               replyMarkup           : Option[ReplyMarkup] = None
                             ) extends ApiRequest[Either[Message, Boolean]]