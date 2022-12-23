a = "hello"
print(sorted(a))

b = "elloh"
print(sorted(b))

print(sorted(a) == sorted(b))
print(tuple(sorted(a)) == tuple(sorted(b)))