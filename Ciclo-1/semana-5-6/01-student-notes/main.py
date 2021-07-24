import json


with open('notes.json', 'r') as reader:
    main_data = json.loads(reader.read())
    reader.close()


def average(notes_list):
    average_notes = {}
    for subject, notes in notes_list.items():
        average_note = sum(notes) / len(notes)
        average_notes[subject] = {
            'average': average_note,
            'approved': True if average_note >= 3.5 else False
        }

    return average_notes


def write_average(students_average):
    students_average_str = json.dumps(students_average)

    file_write = open('notes_average.json', 'w')
    file_write.write(students_average_str)
    file_write.close()


def print_average(students_average):
    pass


def main():
    students_average = []
    rt_list = main_data['routes']
    for rt in rt_list:
        for student in rt_list[rt]:
            student['notes'] = average(student['notes'])
            students_average.append(student)

    write_average(students_average)


if __name__ == '__main__':
    main()
