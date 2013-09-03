import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
	public static void main(String args[] ){
		String url ="<flag:0><md5:08a4f5b8dcf0fa3a2e4089ed0f589fbf><link:08a4f5b8dcf0fa3a2e4089ed0f589fbf><url:http://health.cqnews.net/html/2013-08/26/content_27578394.htm><site:health.cqnews.net><pdate:1377492482><rptid:4b67b6c4f87e0733><rptid1:4b67b6c4f87e0733><tag:info image exmultipage health onebox><crawtime:1377492984><pagesize:141212><newsrank:81><focus:1><code:1><title:导胜于堵 以情制情战胜产后抑郁症><content:[img]http://i2.cqnews.net/health/attachement/jpg/site82/20130826/a41f7267eb28138522ae58.jpg[/img][br]母亲就是孩子的世界，母亲的微笑就是孩子灿烂的天空，然而在产后新妈妈阶段，母亲往往是欣喜和担忧并存，会忧虑各种问题，要想远离抑郁，似乎还真不是一件容易的事情。[br][img]http://i3.cqnews.net/health/attachement/jpg/site82/20130826/a41f7267eb28138522ba59.jpg[/img][br]最近，产后40余天的莉莉经常感到心情不适，时时委屈。1个月过去了，家人都结束了产前产后的关怀，只有自己忙着照顾孩子，生活十分单调，同时烦恼还越来越多:担心孩子吃不好、担心自己身材会走样，担心工作会耽误……再加上孩子天天哭闹造成睡眠不足，莉莉的情绪越来越差，经常莫名其妙地发脾气，连老公也瞧着不顺眼。眼看家庭战争一触即发，去找心理医生倾诉调整才知道，原来，都是产后抑郁惹的祸。[br][img]http://i2.cqnews.net/health/attachement/jpg/site82/20130826/a41f7267eb28138522c55a.jpg[/img][br]那么，什么是产后抑郁症呢?[br]产后抑郁属于与生育相关的精神障碍，即心情低落、兴趣和愉快感丧失，易疲劳，易急躁表现的精神障碍。很多新妈妈在产后通常把全部精力都放在哺育孩子上，很少参加社会活动，育儿经验严重不足，又没有发泄渠道和解决问题的方式方法，遇到问题无法解决，便会焦虑、情绪低落、从而出现产后抑郁倾向。[br][img]http://i2.cqnews.net/health/attachement/jpg/site82/20130826/a41f7267eb28138522cf5b.jpg[/img][br]产后抑郁的主要表现为情绪低落、悲伤、发脾气、感到委屈，伴有焦虑、紧张、害怕、恐惧。除情绪方面的表现外，思维方面表现为内疚、敏感、自信心不足，注意力不集中、自觉记忆力减退、悲观。行为表现为不愿接触人，没有食欲，睡眠障碍、严重者甚至还会产生自伤、自残、自杀的念头。[br][img]http://i2.cqnews.net/health/attachement/jpg/site82/20130826/a41f7267eb28138522d85c.jpg[/img][br]然而，为什么会有产后抑郁症呢?主要原因有以下两方面:[br]一是心理社会因素。孕期本身就是一个艰苦卓绝的过程，本身就是一个应激性生活事件。其间，女性的生理、心理都会产生很大的变化，角色的转变、人际关系的冲突、经济的重新安排以及自我缺乏调整方法等，都极易产生抑郁。另外，抑郁的发生和性格也有着密切的关系，平时依赖性强、以自我为中心、谨小慎微等内向性格更容易引发产后抑郁症。[br][img]http://i2.cqnews.net/health/attachement/jpg/site82/20130826/a41f7267eb28138522e45d.jpg[/img][br]二是生物学因素。生物学因素又包括遗传因素，比如，家族中有抑郁症病史的产妇更容易出现孕期抑郁和产后抑郁。[br]当产后新妈妈有以上情况时，应当给予适当的重视。首先，产妇应了解有关的心理学知识，做到心中有数;其次，产妇应建立情绪通道，正确疏导情绪;三要以情制情，以别的情绪来协调不良情绪;四要接受情绪导胜于堵;五要逐步“脱敏”，多做放松训练。><onebox:导胜于堵 以情制情战胜产后抑郁症  母亲就是孩子的世界，母亲的微笑就是孩子灿烂的天空，然而在产后新妈妈阶段，母亲往往是欣喜和担忧并存，会忧虑各种问题，要想远离抑郁，似乎还真不是一件容易的事情。><kws:产后抑郁症|战胜><value:100><__ts:extr:1377493321,sxml:1377493321><image_url: >";
		Pattern pattern = Pattern.compile(".*?<tag:(.*?)>.*");
		Matcher matcher = pattern.matcher(url);
		if(matcher.find()){
			System.out.println(matcher.group(1));
			String[] argss = url.split(" ");
			System.out.println(argss.length);
		}
		
	}

}
