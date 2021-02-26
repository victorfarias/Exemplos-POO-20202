package main;

import topic.Pass;
import topic.Topic;

public class Main {

	public static void main(String[] args) {
//		$init 5 2
//		$show
//		[ @ @ = = = ]
		
		Topic topic = new Topic(5, 2);
		System.out.println(topic);

//		$in davi 17
//		$show
//		[ @ @ =davi:17 = = ]
//		$in joao 103
//		$show
//		[ @joao:103 @ =davi:17 = = ]
//		$in ana 35
//		$show
//		[ @joao:103 @ =davi:17 =ana:35 = ]
//		$in rex 20
//		$in bia 16
//		$show
//		[ @joao:103 @bia:16 =davi:17 =ana:35 =rex:20 ]
		
		topic.subir(new Pass("davi", 17));
		System.out.println(topic);
		topic.subir(new Pass("joao", 103));
		System.out.println(topic);
		topic.subir(new Pass("ana", 35));
		System.out.println(topic);
		topic.subir(new Pass("rex", 20));
		topic.subir(new Pass("bia", 16));
		System.out.println(topic);
		
//		$out davi
//		$show
//		[ @joao:103 @bia:16 = =ana:35 =rex:20 ]
//		$in aragao 96
//		$show
//		[ @joao:103 @bia:16 =aragao:96 =ana:35 =rex:20 ]
		
		topic.descer("davi");
		System.out.println(topic);
		topic.subir(new Pass("aragao", 96));
		System.out.println(topic);
		

//		$in lucas 23
//		fail: topic lotada
//		$out marcelo
//		fail: pass nao esta na topic
//		$out ana
//		$in bia
//		fail: pass ja esta na topic
//		$show
//		[ @joao:103 @bia:16 =aragao:96 = =rex:20 ]
//		$end
		
		topic.subir(new Pass("lucas", 23));	
		topic.descer("marcelo");
		topic.descer("ana");
		topic.subir(new Pass("bia", 16));	
		System.out.println(topic);
		
	}

}
