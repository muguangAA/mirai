package net.mamoe.mirai.event.events

import net.mamoe.mirai.Bot
import net.mamoe.mirai.contact.Group
import net.mamoe.mirai.contact.QQ
import net.mamoe.mirai.message.Message
import net.mamoe.mirai.message.MessageChain


abstract class GroupEvent(bot: Bot, val group: Group) : BotEvent(bot)


class GroupMessageEvent(bot: Bot, group: Group, val sender: QQ, val message: MessageChain) : GroupEvent(bot, group) {
    suspend inline fun reply(message: Message) = group.sendMessage(message)

    suspend inline fun reply(message: String) = group.sendMessage(message)

    suspend inline fun reply(message: MessageChain) = group.sendMessage(message)
}