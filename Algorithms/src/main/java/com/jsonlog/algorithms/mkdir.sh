#!/bin/bash
for((i = 1;i < 10; i++));do
	mkdir "_00"$i
done
for((i = 10;i < 100; i++));do
	mkdir "_0"$i
done
for((i = 100;i < 300; i++));do
	mkdir "_"$i
done
