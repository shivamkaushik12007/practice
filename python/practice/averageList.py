if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query = student_marks[input()]
    p=sum(query)/len(query)
    print("{0:.2f}".format(p))
