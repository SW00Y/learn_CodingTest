-- 코드를 입력하세요
SELECT ingredient_type,sum(total_order) from first_half a, icecream_info b
where a.flavor = b.flavor
group by ingredient_type