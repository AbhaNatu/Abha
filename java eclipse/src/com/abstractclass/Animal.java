package com.abstractclass;

abstract class Animal {
double hieght;
double weight;
Animal(){}
Animal(double height,double weight)
{
	this.hieght=height;
	this.weight=weight;
}
abstract void talk();
}
