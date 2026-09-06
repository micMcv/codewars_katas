SELECT f.name , sum(won) as won, sum(lost) as lost FROM fighters f
JOIN winning_moves w ON f.move_id = w.id
WHERE move NOT IN ('Hadoken', 'Shouoken' , 'Kikoken')
GROUP BY f.name
ORDER BY won DESC
LIMIT 6;
