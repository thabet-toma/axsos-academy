# Generated by Django 2.2.4 on 2022-09-27 10:13

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('app', '0002_authors_books'),
    ]

    operations = [
        migrations.AddField(
            model_name='authors',
            name='notes',
            field=models.TextField(default=''),
            preserve_default=False,
        ),
    ]
